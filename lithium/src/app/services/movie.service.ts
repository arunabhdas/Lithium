import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private http = inject(HttpClient);
  constructor() { }

  getTopRatedMovies(page = 1) {
    return this.http.get()
  }

  getMovieDetails() {}

}
