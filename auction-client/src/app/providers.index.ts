import {EngLocalizationService, LocalizationService} from "./auction/shared/localization.service";
import {AuthService} from "./auction/auth/auth.service";

export const Providers: any = [
    {provide: LocalizationService, useClass: EngLocalizationService},
    {provide: AuthService, useClass: AuthService}
];
