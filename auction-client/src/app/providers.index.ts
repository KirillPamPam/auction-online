import {EngLocalizationService, LocalizationService} from "./auction/shared/localization.service";
import {AuthService} from "./auction/auth/auth.service";
import {ApiService} from "./auction/shared/backend.api";

export const Providers: any = [
    {provide: LocalizationService, useClass: EngLocalizationService},
    {provide: AuthService, useClass: AuthService},
    {provide: ApiService, useClass: ApiService}
];
