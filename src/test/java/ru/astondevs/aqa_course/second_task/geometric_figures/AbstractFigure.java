package ru.astondevs.aqa_course.second_task.geometric_figures;

import ru.astondevs.aqa_course.second_task.shape_interface.Figure;

public abstract class AbstractFigure implements Figure {

   protected String backgroundColor;
   protected String borderColor;

   public AbstractFigure(String backgroundColor, String borderColor) {
      this.backgroundColor = backgroundColor;
      this.borderColor = borderColor;
   }

   @Override
   public String getBackgroundColor() {
      return backgroundColor;
   }

   @Override
   public String getBorderColor() {
      return borderColor;
   }

   public void setBackgroundColor(String backgroundColor) {
      this.backgroundColor = backgroundColor;
   }

   public void setBorderColor(String borderColor) {
      this.borderColor = borderColor;
   }
}
