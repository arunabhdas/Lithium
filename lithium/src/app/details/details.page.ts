import { Component, Input, OnInit, WritableSignal, inject, signal } from '@angular/core';
import { 
  IonHeader, 
  IonToolbar, 
  IonTitle, 
  IonContent,
  IonIcon,
  IonBackButton,
  IonButtons,
  IonCard,
  IonCardHeader,
  IonCardTitle,
  IonCardSubtitle,
  IonCardContent,
  IonList, 
  IonItem,
  IonSkeletonText,
  IonAvatar,
  IonAlert,
  IonLabel,
  IonBadge,
  IonInfiniteScroll,
  IonInfiniteScrollContent,
  InfiniteScrollCustomEvent,
  IonText,
} from '@ionic/angular/standalone';
import { CurrencyPipe, DatePipe } from '@angular/common';
import { MovieService } from '../services/movie.service';
import { MovieResult } from '../services/interfaces';
import { cashOutline, calendarOutline } from 'ionicons/icons';
import { addIcons } from 'ionicons';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-details',
  templateUrl: './details.page.html',
  styleUrls: ['./details.page.scss'],
  standalone: true,
  imports: [
    IonHeader, 
    IonToolbar, 
    IonTitle, 
    IonContent, 
    IonIcon,
    IonBackButton,
    IonButtons,
    IonCard,
    IonCardHeader,
    IonCardTitle,
    IonCardSubtitle,
    IonCardContent,
    IonText,
    IonLabel,
    IonButtons,
    IonList, 
    IonItem, 
    IonSkeletonText, 
    IonAvatar,
    IonAlert,
    IonLabel,
    IonBadge,
    IonInfiniteScroll,
    IonInfiniteScrollContent,
    CurrencyPipe,
    DatePipe,
    RouterModule
  ]
})
export class DetailsPage implements OnInit {
  private movieService = inject(MovieService);
  public imageBaseUrl = 'https://image.tmdb.org/t/p';
  public movie: WritableSignal<MovieResult | null> = signal(null);

  @Input()
  set id(movieId: string) {
    this.movieService.getMovieDetails(movieId).subscribe((movie)=> {
      console.log(movie);
      this.movie.set(movie);
    });
  }


  constructor() { 
    addIcons({ cashOutline, calendarOutline });
  }

  ngOnInit() {
  }

}
