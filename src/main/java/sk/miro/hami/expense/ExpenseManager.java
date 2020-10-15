package sk.miro.hami.expense;

import java.util.Date;

public class ExpenseManager {

    /*
    public void addExpense(Expense e) {
        System.out.println("Adding expense: " + e.getId());
    }
    */

    public static void main(String[] args) {

        Sequencer userSeq = new GenericSequencer();
        Sequencer expenseSeq = new GenericSequencer();
        Sequencer categorySeq = new GenericSequencer();
        Sequencer roleSeq = new GenericSequencer();

        Category groceries = new Category(categorySeq.next(), "buying food, vegetables, and bred", "Grocery store");
        Category drugstore = new Category(categorySeq.next(), "buying soap, washing powder, and toilet paper", "Drug store");
        Category pharmacy = new Category(categorySeq.next(), "buying drugs, headache pills", "pharmacy");


        Role role = new Role(roleSeq.next(), Authority.ADMIN);
        User user = new User(userSeq.next(), "miroslav.hami" , "password");
        user.setRole(role);

        Expense e1 = new Expense();
        e1.setUser(user);
        e1.setId(expenseSeq.next());
        e1.setCreated(new Date());
        e1.setAmount(60.20f);
        e1.setCategory(groceries);

        Expense e2 = new Expense();
        e2.setUser(user);
        e2.setId(expenseSeq.next());
        e2.setCreated(new Date());
        e2.setAmount(20.40f);
        e2.setCategory(drugstore);

        Expense e3 = new Expense();
        e3.setUser(user);
        e3.setId(expenseSeq.next());
        e3.setCreated(new Date());
        e3.setAmount(14.80f);
        e3.setCategory(pharmacy);

        //ExpenseRepository er = new InMemoryExpenseRepository();
        //read(e2.getId());
        System.out.println("Expense: " + e1);
        System.out.println("Expense: " + e2);
        System.out.println("Expense: " + e3);
    }
}