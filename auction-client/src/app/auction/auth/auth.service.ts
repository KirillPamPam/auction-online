import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class AuthService {
     constructor(private http: HttpClient) {
     }

     click() {
         this.http.get('http://localhost:8080/auction-service-1.0/hello')
             .subscribe(data => console.log(data));
     }
}
