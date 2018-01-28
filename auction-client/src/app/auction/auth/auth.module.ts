import {NgModule} from "@angular/core";
import {AuthComponent} from "./auth.component";
import {ButtonModule, InputTextModule, PasswordModule} from "primeng/primeng";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
    imports: [
        InputTextModule,
        PasswordModule,
        ButtonModule,
        HttpClientModule
    ],
    exports: [

    ],
    declarations: [
        AuthComponent
    ]
})
export class AuthModule {
}
