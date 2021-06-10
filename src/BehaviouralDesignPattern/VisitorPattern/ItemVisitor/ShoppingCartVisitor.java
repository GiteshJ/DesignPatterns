package BehaviouralDesignPattern.VisitorPattern.ItemVisitor;

interface ShoppingCartVisitor 
{
   
    int visit(Book book);
    int visit(Fruit fruit);
}
  