import { Component, OnInit } from '@angular/core';
import { ParkingInfo } from '../ParkingInfo';
import {  ParkingServiceService } from '../parking-service.service';
@Component({
  selector: 'app-parkings',
  templateUrl: './parkings.component.html',
  styleUrls: ['./parkings.component.scss']
})
export class ParkingsComponent implements OnInit {


  parkings?: ParkingInfo[];

  constructor(private ParkingServiceService: ParkingServiceService) { }

  ngOnInit(): void {

    this.ParkingServiceService.getPartking().subscribe(data => {

      this.parkings = data;
   });

  }

}
