package com.crofle.livecrowdfunding.service.serviceImpl;

import com.crofle.livecrowdfunding.domain.entity.Project;
import com.crofle.livecrowdfunding.dto.*;
import com.crofle.livecrowdfunding.dto.response.ProjectResponseInfoDTO;
import com.crofle.livecrowdfunding.dto.request.PageRequestDTO;
import com.crofle.livecrowdfunding.dto.response.PageListResponseDTO;
import com.crofle.livecrowdfunding.repository.ProjectRepository;
import com.crofle.livecrowdfunding.service.AdminProjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class AdminProjectServiceImpl implements AdminProjectService {
    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    @Override
    public PageListResponseDTO<ProjectResponseInfoDTO> findProjectList(PageRequestDTO pageRequestDTO) { //naming precision required
        // 1. Create a Pageable object using the pageRequestDTO
        Pageable pageable = PageRequest.of(pageRequestDTO.getPage() - 1, pageRequestDTO.getSize());

        // 2. Fetch a paginated result using the repository
        //반환값을 entity 형태로 저장
        Page<Project> projectPage = projectRepository.findAll(pageable);

        // 3. Map the Project entities to ProjectInfoDTO objects
        //entity 형태를 dto 형태로 response할 수 있는 형태로 변환
        List<ProjectResponseInfoDTO> projectResponseInfoDTOList = projectPage.stream()
                .map(project -> new ProjectResponseInfoDTO(
                        project.getId(),
                        project.getMaker().getId(),
                        project.getManager().getId(),
                        project.getRatePlan().getId(),
                        project.getCategory().getId(),
                        project.getProductName(),
                        project.getSummary(),
                        project.getPrice(),
                        project.getDiscountPercentage(),
                        project.getStartAt(),
                        project.getEndAt(),
                        project.getPercentage(),
                        project.getReviewProjectStatus(),
                        project.getRejectionReason(),
                        project.getProgressProjectStatus(),
                        project.getGoalAmount(),
                        project.getContentImage()
                ))
                .collect(Collectors.toList());

        // 4. Create PageInfoDTO from pageRequestDTO and the total count of projects
        PageInfoDTO pageInfoDTO = PageInfoDTO.withAll().pageRequestDTO(pageRequestDTO).total((int) projectPage.getTotalElements())
                .build();

        // 5. Return the response wrapped in a PageListResponseDTO
        //여기에서 넣어줘야 하는 pageInfoDTO를 만들기 위해 위에서 build를 해준다.
        PageListResponseDTO<ProjectResponseInfoDTO> pageListResponseDT = PageListResponseDTO.<ProjectResponseInfoDTO>builder()
                .pageInfoDTO(pageInfoDTO)
                .dataList(projectResponseInfoDTOList)
                .build();

        for (ProjectResponseInfoDTO p : pageListResponseDT.getDataList()) {
            log.info("Project ID: " + p.getId());
            log.info("Product Name: " + p.getProductName());
        }

        return pageListResponseDT;
    }

    @Override
    public ProjectResponseInfoDTO findProject(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        ProjectResponseInfoDTO projectResponseInfoDTO = modelMapper.map(project, ProjectResponseInfoDTO.class);
        log.info("checking yejina");
        log.info(projectResponseInfoDTO.getProductName());

        return projectResponseInfoDTO;
    }

    //승인, 반려, 반려 사유 이메일로 보내기
}
