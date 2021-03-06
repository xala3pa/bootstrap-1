package pl.softwaremill.bootstrap.dao

import pl.softwaremill.bootstrap.domain.Entry

trait EntryDAO {

  def loadAll: List[Entry]

  def countItems(): Long

  def add(entry: Entry)

  def remove(entryId: String)

  def load(entryId: String): Option[Entry]

  def update(entryId: String, message: String)

}
