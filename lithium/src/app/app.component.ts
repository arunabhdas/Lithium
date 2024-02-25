import { Component } from '@angular/core';
import { 
  IonApp,
  IonRouterOutlet,
  IonMenu,
  IonButtons, 
  IonMenuButton,
  IonIcon,
  IonHeader, 
  IonToolbar, 
  IonTitle, 
  IonContent,
  IonList, 
  IonItem,
  IonSkeletonText,
  IonAvatar,
  IonAlert,
  IonLabel,
  IonBadge,
  IonInfiniteScroll,
  IonInfiniteScrollContent,
  InfiniteScrollCustomEvent
} from '@ionic/angular/standalone';
import { DatePipe } from '@angular/common';
import { RouterModule } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  standalone: true,
  imports: [
    IonApp,
    IonRouterOutlet,
    IonMenu,
    IonButtons,
    IonIcon,
    IonMenuButton,
    IonHeader, 
    IonToolbar, 
    IonTitle, 
    IonContent, 
    IonList, 
    IonItem, 
    IonSkeletonText, 
    IonAvatar,
    IonAlert,
    IonLabel,
    IonBadge,
    IonInfiniteScroll,
    IonInfiniteScrollContent,
    DatePipe,
    RouterModule
  ],
})
export class AppComponent {
  constructor() {}
}
