import { Component, OnInit } from '@angular/core';
import { BenutzerService } from '../benutzer.service';
import { Benutzer } from '../benutzer';

@Component({
  selector: 'app-benutzer',
  templateUrl: './benutzer.component.html',
  styleUrls: ['./benutzer.component.css'],
})
export class BenutzerComponent implements OnInit {
  benutzer: Benutzer[] = [];
  errorMessage: string = '';

  constructor(private benutzerService: BenutzerService) {}

  ngOnInit(): void {
    this.benutzerService.getBenutzer().subscribe(
      (data: Benutzer[]) => {
        console.log(data);
        this.benutzer = data;
      },
      (error) => {
        this.errorMessage = error;
        console.error('There was an error', error);
      }
    );
  };
}
