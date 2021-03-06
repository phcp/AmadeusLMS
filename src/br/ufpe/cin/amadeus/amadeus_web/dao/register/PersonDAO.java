/**
Copyright 2008, 2009 UFPE - Universidade Federal de Pernambuco
 
Este arquivo � parte do programa Amadeus Sistema de Gest�o de Aprendizagem, ou simplesmente Amadeus LMS
 
O Amadeus LMS � um software livre; voc� pode redistribui-lo e/ou modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como
publicada pela Funda��o do Software Livre (FSF); na vers�o 2 da Licen�a.
 
Este programa � distribu�do na esperan�a que possa ser �til, mas SEM NENHUMA GARANTIA; sem uma garantia impl�cita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. Veja a Licen�a P�blica Geral GNU para maiores detalhes.
 
Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU, sob o t�tulo "LICENCA.txt", junto com este programa, se n�o, escreva para a Funda��o do Software Livre (FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA.
**/

package br.ufpe.cin.amadeus.amadeus_web.dao.register;

import java.util.List;

import br.ufpe.cin.amadeus.amadeus_web.dao.GenericDAO;
import br.ufpe.cin.amadeus.amadeus_web.domain.content_management.Course;
import br.ufpe.cin.amadeus.amadeus_web.domain.content_management.Log;
import br.ufpe.cin.amadeus.amadeus_web.domain.content_management.Role;
import br.ufpe.cin.amadeus.amadeus_web.domain.register.Person;
import br.ufpe.cin.amadeus.amadeus_web.syncronize.AccessInfo;
import br.ufpe.cin.amadeus.amadeus_web.syncronize.TimelineItem;

public interface PersonDAO extends GenericDAO<Person, Integer> {
	
	public List<Person> getTeachersByName(String name);
	public List<Person> getAssistanceInCourse(Course course, Role role);
	public List<String> getAllEmails();
	public Person getPersonByLogin(String login);
	public Person getPersonByUserName(String userName);
	public int getPersonByTwitterLogin(String screenName);
	public List<TimelineItem> getTimelineByPersonID(int personID, int groupID);
	public List<Log> getLogsByDayAndPerson(String data, int groupID, int personID);

}
