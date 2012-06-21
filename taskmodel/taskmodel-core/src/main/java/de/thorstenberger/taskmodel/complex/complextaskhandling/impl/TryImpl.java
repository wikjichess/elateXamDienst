/*

Copyright (C) 2006 Thorsten Berger

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
/**
 *
 */
package de.thorstenberger.taskmodel.complex.complextaskhandling.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.thorstenberger.taskmodel.TaskApiException;
import de.thorstenberger.taskmodel.complex.ComplexTaskFactory;
import de.thorstenberger.taskmodel.complex.complextaskdef.Category;
import de.thorstenberger.taskmodel.complex.complextaskdef.ComplexTaskDefRoot;
import de.thorstenberger.taskmodel.complex.complextaskdef.SubTaskDef;
import de.thorstenberger.taskmodel.complex.complextaskhandling.Page;
import de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet;
import de.thorstenberger.taskmodel.complex.complextaskhandling.Try;
import de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskHandling;
import de.thorstenberger.taskmodel.complex.jaxb.ObjectFactory;

/**
 * @author Thorsten Berger
 *
 */
public class TryImpl implements Try {

  private final ComplexTaskHandling.Try tryType;
  private final ComplexTaskFactory complexTaskFactory;
  private final ComplexTaskDefRoot complexTaskDefRoot;

  /**
	 *
	 */
  public TryImpl(ComplexTaskHandling.Try tryType, ComplexTaskFactory complexTaskFactory, ComplexTaskDefRoot complexTaskDefRoot) {
    this.tryType = tryType;
    this.complexTaskFactory = complexTaskFactory;
    this.complexTaskDefRoot = complexTaskDefRoot;
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getStartTime()
   */
  public long getStartTime() {
    return tryType.getStartTime();
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getNumberOfPages()
   */
  public int getNumberOfPages() {
    return tryType.getPage().size();
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getPage(int)
   */
  public Page getPage(int pageNo) {
    Iterator it = tryType.getPage().iterator();
    while (it.hasNext()) {
      ComplexTaskHandling.Try.Page pageType = (ComplexTaskHandling.Try.Page) it.next();
      if (pageType.getNo() == pageNo)
        return new PageImpl(pageType, complexTaskFactory, complexTaskDefRoot);
    }
    // throw Exception("You tried to access a Page that doesn't exist");
    return null;
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getPages()
   */
  public List<Page> getPages() {
    List<Page> ret = new ArrayList<Page>();
    Iterator it = tryType.getPage().iterator();
    while (it.hasNext()) {
      ComplexTaskHandling.Try.Page pageType = (ComplexTaskHandling.Try.Page) it.next();
      ret.add(new PageImpl(pageType, complexTaskFactory, complexTaskDefRoot));
    }
    return ret;
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getProcessPercentage()
   */
  public ProgressInformation getProgressInformation() {
    List<Page> pages = getPages();
    int numOfSubTasks = 0;
    int numOfProcessedSubTasks = 0;

    for (Page page : pages) {
      List<SubTasklet> subtasklets = page.getSubTasklets();
      numOfSubTasks += subtasklets.size();
      for (SubTasklet subTasklet : subtasklets)
        if (subTasklet.isProcessed()) {
          numOfProcessedSubTasks++;
        }
    }

    if (numOfSubTasks == 0)
      return new ProgressInformationImpl(numOfSubTasks, numOfProcessedSubTasks, 0);

    return new ProgressInformationImpl(numOfSubTasks, numOfProcessedSubTasks, (float) numOfProcessedSubTasks
        / (float) numOfSubTasks);

  }

  public static class ProgressInformationImpl implements ProgressInformation {

    private final int numOfSubtasks;
    private final int numOfProcessedSubtasks;
    private final float progressPercentage;

    /**
     * @param numOfSubtasks
     * @param numOfProcessedSubtasks
     * @param progressPercentage
     */
    public ProgressInformationImpl(int numOfSubtasks, int numOfProcessedSubtasks, float progressPercentage) {
      this.numOfSubtasks = numOfSubtasks;
      this.numOfProcessedSubtasks = numOfProcessedSubtasks;
      this.progressPercentage = progressPercentage;
    }

    /*
     * (non-Javadoc)
     *
     * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try.ProgressInformation#getNumOfProcessedSubtasks()
     */
    public int getNumOfProcessedSubtasklets() {
      return numOfProcessedSubtasks;
    }

    /*
     * (non-Javadoc)
     *
     * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try.ProgressInformation#getNumOfSubtasks()
     */
    public int getNumOfSubtasklets() {
      return numOfSubtasks;
    }

    /*
     * (non-Javadoc)
     *
     * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try.ProgressInformation#getProgressPercentage()
     */
    public float getProgressPercentage() {
      return progressPercentage;
    }

  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.ComplexTaskFactory#createPage(int,
   * de.thorstenberger.taskmodel.complex.complextaskdef.Category)
   */
  public Page addNewPage(int pageNumber, Category category) throws TaskApiException {

    ComplexTaskHandling.Try.Page pageType;
    pageType = (new ObjectFactory()).createComplexTaskHandlingTryPage();
    pageType.setNo(pageNumber);
    pageType.setCategoryRefID(category.getId());
    tryType.getPage().add(pageType);

    return new PageImpl(pageType, complexTaskFactory, complexTaskDefRoot);
  }

  /**
   * backdoor access
   *
   * @return
   */
  public ComplexTaskHandling.Try getTryType() {
    return tryType;
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * de.thorstenberger.taskmodel.complex.complextaskhandling.Try#lookupSubTasklet(de.thorstenberger.taskmodel.complex
   * .complextaskdef.SubTaskDef)
   */
  public SubTasklet lookupSubTasklet(SubTaskDef subTaskDef) {
    List<Page> pages = getPages();
    for (Page page : pages) {
      List<SubTasklet> subTasklets = page.getSubTasklets();
      for (SubTasklet subTasklet : subTasklets)
        if (subTasklet.getSubTaskDefId().equals(subTaskDef.getId()))
          return subTasklet;
    }
    // not found, happens if the subTaskDef has not been chosen by the (random) selection algorithms in
    // ComplexTaskBuilder
    return null;
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getTimeExtension()
   */
  public long getTimeExtension() {
    if (tryType.isSetExtensionTime())
      return tryType.getExtensionTime();
    else
      return 0;
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#setTimeExtension(long)
   */
  public void setTimeExtension(long msec) {
    if (msec < 0)
      throw new IllegalArgumentException("The extension time for a try must not be negative!");

    tryType.setExtensionTime(msec);
  }

  /*
   * (non-Javadoc)
   *
   * @see de.thorstenberger.taskmodel.complex.complextaskhandling.Try#getRandomSeed()
   */
  public long getRandomSeed() {
    if (tryType.isSetRandomSeed())
      return tryType.getRandomSeed();
    else
      return 0;
  }

}
