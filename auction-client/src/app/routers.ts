import {Routes} from "@angular/router";
import {AuthComponent} from "./auction/auth/auth.component";

export const appRoutes: Routes = [
    {path:"", redirectTo: "/auth", pathMatch: "full"},
    {path:"auth", component: AuthComponent},
];