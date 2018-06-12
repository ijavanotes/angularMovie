import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse } from '@angular/common/http';
import 'rxjs/Rx';
import { Observable } from 'rxjs/Rx';
import { CommonModule } from '@angular/common';
import { Injectable } from '@angular/core';

@Injectable()
@Component({
    selector: 'app-movies',
    templateUrl: './movies.component.html',
    styleUrls: ['./movies.component.css']
  })
  export class MoviesComponent {
    constructor (private httpService: HttpClient) { }
    arrMovies: string [];
    public data: Object;
    public temp_var: Object=false;
    ngOnInit () {
        this.httpService.get('./assets/movies.json').subscribe((res: Response) => {
           this.data=res;	 // FILL THE ARRAY WITH DATA.
            this.temp_var=true;
            //  console.log(this.arrBirds[1]);
          },
          (err: HttpErrorResponse) => {
            console.log (err.message);
          }
        );
      }
  }   