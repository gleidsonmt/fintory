package io.github.gleidsonmt.fintory.components.list_view;

import io.github.gleidsonmt.fintory.components.aside.labels.ArrowLabel;
import io.github.gleidsonmt.fintory.components.aside.labels.InfoLabel;
import io.github.gleidsonmt.fintory.components.aside.labels.UserLabel;
import io.github.gleidsonmt.fintory.model.IssuedAccess;
import io.github.gleidsonmt.fintory.model.User;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  02/02/2025
 */
public class ListViewIssued extends ListView<IssuedAccess> {
    public ListViewIssued() {
        getItems().setAll(
                new IssuedAccess(
                        new User("Ellen Wilson", "jared.png"),
                        9, "Sutterstock 350", "$1,649.00/year"
                ),
                new IssuedAccess(
                        new User("Margon Madison", "misha.png"),
                        9, "Webflow Business Pro 350", "$59.00/month"
                )
        );

        setCellFactory(new Callback<ListView<IssuedAccess>, ListCell<IssuedAccess>>() {
            @Override
            public ListCell<IssuedAccess> call(ListView<IssuedAccess> issuedAccessListView) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(IssuedAccess item, boolean empty) {
                        if (item != null && !empty) {
                            setText(null);
                            setGraphic(
                                    new Item(
                                            new UserLabel(item.user().name(), item.user().avatar()),
                                            new InfoLabel(item.desc()),
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
