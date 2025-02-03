package io.github.gleidsonmt.fintory.components.list_view;

import io.github.gleidsonmt.fintory.components.aside.labels.ArrowLabel;
import io.github.gleidsonmt.fintory.components.aside.labels.DetailedLabel;
import io.github.gleidsonmt.fintory.components.aside.labels.UserLabel;
import io.github.gleidsonmt.fintory.model.*;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class ListViewTransactions extends ListView<Transaction> {
    public ListViewTransactions() {
        getItems().setAll(
                new Transaction(
                        new Organization("Dropbox", "dropbox.jpg"),
                        LocalDate.of(2021, 12, 20),
                        Recurse.MONTHLY, "-$299.00"
                ),
                new Transaction(
                        new Organization("Zendesk", "zendesk.jpg"),
                        LocalDate.of(2021, 12, 19),
                        Recurse.ANNUAL, "-$1490.00"
                )
        );


        setCellFactory(new Callback<>() {
            @Override
            public ListCell<Transaction> call(ListView<Transaction> issuedAccessListView) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(Transaction item, boolean empty) {
                        if (item != null && !empty) {
                            setText(null);
                            setGraphic(
                                    new Item(
                                            new UserLabel(item.org().name(), item.org().avatar()),
                                            new DetailedLabel(
                                                    DateTimeFormatter.ofPattern("MMM dd, LLLL").format(item.date()),
                                                    item.recurse()
                                            ),
                                            new ArrowLabel(item.details())
                                    )
                            );
                        } else {
                            setText(null);
                            setGraphic(null);
                        }
                    }
                };
            }
        });
    }
}
