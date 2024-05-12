import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{

    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        this.children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        return children.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
    }
}

// This is the CompositeBox class that implements the Box interface.
// It contains a list of Box objects and calculates the total price of all the boxes in the list.
