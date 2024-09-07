package com.kototo.mvc.ex.pojo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Null
    private String username;

    @NotNull
    private String pwd;

    @NotNull
    @AssertTrue
    private Boolean isTrue;

    @AssertFalse
    private Boolean isFalse;

    @Min(100)
    @Max(200)
    private Integer num;

    @DecimalMin("10.0")
    @DecimalMax("100.0")
    private Double score;

    @Size(min = 6,max = 10)
    private String string;

    @Digits(integer = 5, fraction = 2)
    private Double salary;

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date1;
    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date2;

    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String email;

    @Length(min = 8, max = 12)
    private String str;

    @NotEmpty
    private String empty;

    @Range(min = 100, max = 200)
    private Integer aaa;

    @NotBlank
    private String bbb;

}
