import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  private url = 'https://jsonplaceholder.typicode.com/users';

  constructor(private http: HttpClient) {}

   getUser(id: number): Observable<User> {
    return this.http.get<User>(`${this.url}/${id}`);
  }
  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.url);
  }
}
