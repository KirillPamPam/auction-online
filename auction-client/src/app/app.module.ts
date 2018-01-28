import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {AppComponent} from "./app.component";
import {RouterModule} from "@angular/router";
import {appRoutes} from "./routers";
import {AuthModule} from "./auction/auth/auth.module";
import {Providers} from "./providers.index";

@NgModule({
    imports: [
        BrowserModule,
        RouterModule.forRoot(appRoutes, {useHash: true}),
        AuthModule
    ],
    declarations: [
        AppComponent
    ],
    providers: [
        Providers
    ],
    bootstrap: [
        AppComponent
    ]
})
export class AppModule {}