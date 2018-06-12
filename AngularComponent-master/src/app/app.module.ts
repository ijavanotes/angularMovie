import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HomeComponent } from './home/home.component';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ROUTING } from './app.routing';
import { RouterModule } from '@angular/router';
import {MoviesComponent} from './movies/movies.component';
import { HttpClientModule } from '@angular/common/http';  
import { DataTablesModule } from 'angular-datatables';
 
import 'rxjs/Rx';
import { Observable } from 'rxjs/Rx';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
     HomeComponent,
    MoviesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ROUTING,
    HttpClientModule,
    DataTablesModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
