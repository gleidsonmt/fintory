package io.github.gleidsonmt.fintory.model;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public record Card(String name, Status status, int issuedTimes, double cardNumber) {
}
