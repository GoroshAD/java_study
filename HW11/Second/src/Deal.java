public class Deal {
    private String text;

    public Deal (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Deal deal = (Deal) obj;
        return text.equals(deal.getText());
    }

    public boolean containsWord(String word) {
        return text.contains(word);
    }
}
