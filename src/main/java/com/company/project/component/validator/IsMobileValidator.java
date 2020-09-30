package com.company.project.component.validator;

import com.company.project.component.annotation.IsMobile;
import com.company.project.component.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * isMobile注解校验代码
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {
    private boolean required = false;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // value为空时进行校验
        if (StringUtils.isBlank(value)) {
            if (required) {
                return false;
            }
            return true;
        } else {
            // 不为空时进行校验
            return ValidatorUtils.isMobile(value);
        }
    }
}
