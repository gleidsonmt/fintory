package io.github.gleidsonmt.fintory.model;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public record IssuedAccess(User user, int times, String desc, String details) {
}
