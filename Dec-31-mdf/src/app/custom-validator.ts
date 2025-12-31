import { AbstractControl, ValidationErrors } from "@angular/forms";

export function OnlyLetters(control : AbstractControl) 
: ValidationErrors | null {
    if (!control.value) { return null;}
    const regex = /^[A-Za-z]+$/;
    return regex.test(control.value) ? null : {OnlyLetters : true};
}