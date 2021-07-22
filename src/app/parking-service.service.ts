import { Injectable } from '@angular/core';
import { ParkingInfo } from './ParkingInfo';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ParkingServiceService {

  constructor(private HttpClient : HttpClient) { }

  getPartking(): Observable<ParkingInfo[]>{

    return this.HttpClient.get<ParkingInfo[]>('http://localhost:8082/api/parkings');

  }




  }
