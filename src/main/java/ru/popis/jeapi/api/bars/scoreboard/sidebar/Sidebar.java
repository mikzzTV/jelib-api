package ru.popis.jeapi.api.bars.scoreboard.sidebar;

import ru.popis.jeapi.api.bars.Bar;

import java.util.Collection;
import java.util.List;

public interface Sidebar extends Bar {

    Collection<SidebarLine> getContent();

    void setTitle(String title);

    void setLines(List<String> lines);

    void setLine(int index, String text);
}
