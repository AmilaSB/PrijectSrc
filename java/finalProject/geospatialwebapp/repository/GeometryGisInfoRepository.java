package finalProject.geospatialwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import finalProject.geospatialwebapp.model.GeometryGisInfo;

public interface GeometryGisInfoRepository extends JpaRepository<GeometryGisInfo, Long>  {

}
