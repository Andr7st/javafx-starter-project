module org.andr7st.fx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.andr7st.javafx to javafx.fxml;
    exports org.andr7st.javafx;
}