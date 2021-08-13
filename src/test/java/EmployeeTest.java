import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.dao.EmployeeRegistrationDao;
import com.rev.pro.dao.EmployeeRegistrationDaoImp;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.model.ReimbursementDetails;

class EmployeeTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testAddEmployee() {
		
		List<EmployeeEntity> blist  = new ArrayList<EmployeeEntity>();
		EmployeeRegistrationDao Dao = new EmployeeRegistrationDaoImp();
		blist=Dao.displayAllEmployees();
		assertNotNull(blist);
	}
	
	
	

}
