package BehaviouralDesignPattern.VisitorPattern.ItemVisitor;

interface ItemElement
{
    public int accept(ShoppingCartVisitor visitor);
}
