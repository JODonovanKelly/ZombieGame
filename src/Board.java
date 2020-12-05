public class Board {

    public class Cell {


        private String Type;
        private int hp;

        public Cell(String Type, int hp) {

            setCellType(Type);
            setHp(hp);

        }


        public String getType() {
            return Type;
        }

        public void setCellType(String Type) {
            this.Type = Type;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public boolean isMovable(String Type) {

            if (hp > 0)
                return false;

            else
                return true;
        }

    }
}
