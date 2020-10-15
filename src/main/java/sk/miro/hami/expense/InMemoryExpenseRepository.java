package sk.miro.hami.expense;

import java.util.HashMap;
import java.util.Map;

public class InMemoryExpenseRepository implements ExpenseRepository {

    private Map<Long,Expense> dataStore = new HashMap<>();

    @Override
    public Expense add(Expense expense) {
        return dataStore.put(expense.getId(), expense); // put() ... returns value
    }

    @Override
    public void del(long id) {

    }

    @Override
    public void update(Expense expense) {

    }

    @Override
    public Expense read(long id)
    {
        for (Map.Entry<Long,Expense> me : dataStore.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        return null;
    }
}