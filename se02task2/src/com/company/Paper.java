package com.company;

public class Paper extends CancelleryItem {
    private StringBuilder notes;

    public Paper(String manufacturer, String owner, int cost) {
        super(manufacturer, owner, cost);
        this.notes = new StringBuilder();
    }

    public String getText() {

        return notes.toString();
    }

    Paper write(String note) {
        notes.append(note);
        return this;
    }

    Paper erase(String note) {
        notes.delete(notes.indexOf(note), notes.indexOf(note) + note.length());
        return this;
    }

    @Override
    public String toString() {

        return super.toString(notes.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;

        Paper paper = (Paper) obj;

        return notes != null ? notes.equals(paper.notes) : paper.notes == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
