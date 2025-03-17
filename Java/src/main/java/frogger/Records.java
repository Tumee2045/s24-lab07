package frogger;

import java.util.HashSet;
import java.util.Set;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final Set<FroggerID> records;

    public Records() {
        this.records = new HashSet<>();
    }

    public boolean addRecord(FroggerID froggerID) {
        return records.add(froggerID);  // HashSet prevents duplicates automatically
    }
}