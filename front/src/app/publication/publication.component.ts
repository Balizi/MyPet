import { Component } from '@angular/core';
import { PublicationsService } from './../publications.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-publication',
  templateUrl: './publication.component.html',
  styleUrls: ['./publication.component.css']
})
export class PublicationComponent {

  publication:any;
  check : boolean = this.publicationsService.isLogeed;

  commentForm = new FormGroup({
    message : new FormControl('')
  })

  constructor(private publicationsService:PublicationsService, private router:Router){
  }

  ngOnInit(): void {
    this.publicationsService.getPublications().subscribe(res=>{
      this.publication = res;
      console.log(this.publication);
    })
  }

  comment(id:number){
    this.publicationsService.createComment(this.commentForm.value.message || '',id).subscribe({
      next:(res:any) => {
        this.router.navigate(['/']);
      },
      error:error => (alert(error))
    })
  }

}
