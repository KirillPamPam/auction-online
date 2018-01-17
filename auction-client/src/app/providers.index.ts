import {EngLocalizationService, LocalizationService} from "./auction/shared/localization.service";

export const Providers: any = [
    {provide: LocalizationService, useClass: EngLocalizationService}
];