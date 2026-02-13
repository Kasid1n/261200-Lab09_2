import oop.lsp.Eagle;
import oop.lsp.*;

void main(){
Penguin p = new Penguin();
p.move();
//p.fly() ไม่ได้เพราะมันไม่ใช่ flyable
Sparrow s = new Sparrow();
s.fly();
s.move();
Ostrich o = new Ostrich();
o.move();
Eagle e = new Eagle();
e.fly();
// เอา Human มา Test LSP
Human me = new Human();
me.hunt(new Eagle()); //Human hunt(Movable Object)
}
