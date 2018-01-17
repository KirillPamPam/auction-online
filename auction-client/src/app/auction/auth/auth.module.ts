import {NgModule} from "@angular/core";
import {AuthComponent} from "./auth.component";
import {ButtonModule, InputTextModule, PasswordModule} from "primeng/primeng";

@NgModule({
    imports: [
        InputTextModule,
        PasswordModule,
        ButtonModule
    ],
    exports: [

    ],
    declarations: [
        AuthComponent
    ]
})
export class AuthModule {
}