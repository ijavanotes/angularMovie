import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from '@angular/core/src/metadata/ng_module';
import { HomeComponent } from './home/home.component';
import {MoviesComponent} from './movies/movies.component';
 
 
export const AppRoutes: Routes = [
    { path: 'movie', component: MoviesComponent },
    { path: '', component: HomeComponent }
];
 
export const ROUTING: ModuleWithProviders = RouterModule.forRoot(AppRoutes);