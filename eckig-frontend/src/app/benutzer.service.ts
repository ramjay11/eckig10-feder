import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Benutzer } from './benutzer';


// Service can be injected in any component
@Injectable({
  providedIn: 'root'
})
export class BenutzerService {

  // HttpClient to make REST calls
  private baseUrl = "http://localhost:8088/api/benutzer";
  constructor(private http: HttpClient) { }
  // Method
  getBenutzer() : Observable<Benutzer[]> {
    //return this.http.get<Benutzer[]>(`${this.baseUrl}`)
    return this.http.get<Benutzer[]>(this.baseUrl)
  }
}
