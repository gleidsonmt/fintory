package io.github.gleidsonmt.fintory.model;

import java.time.LocalDate;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public record Transaction(Organization org, LocalDate date, Recurse recurse, String details) {
}
