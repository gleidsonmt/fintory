package io.github.gleidsonmt.fintory.components.aside;

import io.github.gleidsonmt.fintory.components.aside.items.SpendingItem;
import io.github.gleidsonmt.fintory.components.aside.title.CountableTitle;
import io.github.gleidsonmt.fintory.components.aside.title.Title;
import io.github.gleidsonmt.fintory.components.list_view.ListViewIssued;
import io.github.gleidsonmt.fintory.components.list_view.ListViewTransactions;
import io.github.gleidsonmt.fintory.model.Card;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  01/02/2025
 */
public class Aside extends ScrollPane {

    public Aside(Card card) {
        VBox body = new VBox();
        setFitToWidth(true);
        setFitToHeight(true);
        setContent(body);
        body.setPadding(new Insets(40));

        AsideSection headerSection = new AsideSection(new Header(card));
        AsideSection spendingSection = new AsideSection(new SpendingItem());
        AsideSection issuedSection = new AsideSection(new CountableTitle("Issued Access", 2), new ListViewIssued());
        AsideSection recentTransactions = new AsideSection(new Title("Recent transactions"), new ListViewTransactions());

        body.getChildren().setAll(
                headerSection, createSeparator(),
                spendingSection, createSeparator(),
                issuedSection, createSeparator(), recentTransactions
        );

    }

    private Separator createSeparator() {
        Separator separator = new Separator();
        VBox.setMargin(separator, new Insets(20,0,20,0));
        return separator;
    }
}
