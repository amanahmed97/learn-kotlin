package models

import io.ebean.Model
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class GroupModel(
    @Id
    var groupId: Int,
    var groupUsers: List<Users>,
    var bills: List<Bills>
) : Model()