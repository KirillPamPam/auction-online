import {NgModule} from "@angular/core";
import {AuthComponent} from "./auth.component";
import {ButtonModule, InputTextModule, PasswordModule} from "primeng/primeng";
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {BrowserModule} from "@angular/platform-browser";

@NgModule({
    imports: [
        InputTextModule,
        PasswordModule,
        ButtonModule,
        HttpClientModule,
        ButtonModule,
        BrowserModule,
        BrowserAnimationsModule
    ],
    exports: [

    ],
    declarations: [
        AuthComponent
    ]
})
export class AuthModule {
}
