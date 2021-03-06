import {Component, OnDestroy, OnInit} from "@angular/core";
import {LocalizationService} from "../shared/localization.service";

@Component({
    selector: "auth-auction",
    templateUrl: "auth.component.html"
})
export class AuthComponent implements OnInit, OnDestroy{
    usernamePlaceholder: string;
    passwordPlaceholder: string;
    auctionName: string;
    tagline: string;
    signIn: string;
    signUp: string;

    constructor(private localizationService: LocalizationService) {
    }

    ngOnInit(): void {
        this.usernamePlaceholder = this.localizationService.usernameLabel;
        this.passwordPlaceholder = this.localizationService.passwordLabel;
        this.signIn = this.localizationService.signIn;
        this.signUp = this.localizationService.signUp;
        this.auctionName = this.localizationService.vagrantionName;
        this.tagline = this.localizationService.tagline;
    }

    ngOnDestroy(): void {
    }
}