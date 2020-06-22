package SpringBoot.reponsitory.Project;

import SpringBoot.entity.Project;

import java.util.List;

public interface CustomProjectRepository{
    public List<Project>searchBy(Project project,int page,int maxItemsInPage);
}
