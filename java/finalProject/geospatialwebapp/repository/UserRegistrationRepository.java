package finalProject.geospatialwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import finalProject.geospatialwebapp.model.UserRegistration;


public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {

}
