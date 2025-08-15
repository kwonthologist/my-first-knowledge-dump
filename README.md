# 📜 Welcome to my knowledgebase

**Author:** Jaekwon Smith
**Last Updated:** 2025-08-15  

---

## 1. Mission & Vision
My aim is to use this space to create various stand alone projects lumped together as a showcase of my skills. The project will emphasize:

- Fast, predictable deployments  
- A strong foundation for security and maintainability    
- A solo-agile workflow optimized for rapid delivery without sacrificing quality  

All information is based off the workspaces of previous experiences and are subject to change based on my personal growth.

---

## 2. Technology Stack (Techs i inially intend diving into)

| Layer        | Technology                          |
|--------------|-------------------------------------|
| Frontend     | Angular + TypeScript                |
| Backend      | Java Spring Boot         |
| Database     | MySQL                     |
| Authentication | TBD            |
| Testing (FE) | Jasmine, Cypress                    |
| Testing (BE) | JUnit, Mockito                      |
| CI/CD        | GitHub Actions             |
| Hosting/Infra| TBD                   |
| Monitoring   | TBD              |
| Security Tools | TBD    |

---

## 3. Development Guidelines 

### 3.1 Frontend Practices 
- Angular CLI for scaffolding  
- Modular architecture with shared UI and services  
- SCSS for styles  
- Angular Reactive Forms for complex form handling  

### 3.2 Backend Practices
- REST controllers in Spring Boot  
- Layered architecture: Controller → Service → Repository  
- Profile-specific configuration via `application.yml`  
- DTO usage for clear API contracts  

### 3.3 Code Quality
- ESLint + Prettier for Angular  
- TBD for Java  

### 3.4 Documentation
- Keep code **readable**
- `README.md` with setup, tech overview, deployment guide updated regularly.  
- `/docs/` folder for architecture diagrams, API contracts, and major decisions.

---

## 4. Git & Branching Strategy
- **main** → Demo ready  
- **<project_name>/** → Individual feature branches  

Pull Requests (even solo) must:  
- Pass formatting checks  
- Include self-review  
- Run and pass all automated tests  

---

## 5. CI/CD Workflow

### GitHub Actions (Validation Stage):
1. Lint  
2. Build  
3. Unit Tests  

---

## 6. Deployment Standards
- TBD 

---

## 7. Testing & QA
- **Frontend:** Jasmine (unit), Cypress (E2E), 50%+ coverage  
- **Backend:** JUnit + Mockito
- **Pipeline:** Tests must pass before merge  

---

## 8. Monitoring & Security

### Monitoring:
- TBD  

### Security:
- TBD  

---

## 9. Solo Agile Workflow
- Github Projects for backlog & progress  
- Weekly sprint rhythm with self-review & retro  
- Monthly overall review  

---

## 10. Definition of Done
A feature is done when:  
- Code is implemented and merged into `main`  
- Unit & integration tests pass  
- Code is reviewed  
- Deployed to the environment (if needed)  
- Docs updated  
- Monitoring and alerts are configured (if needed)  

---

## 🤝 Future Collaboration (Optional)
If adding contributors:
- Maintain onboarding guide in `/docs/`.
- Use shared workspace for comms (TBD).
- Enforce same PR, testing, and style rules.

---

## ✅ Security & Performance Checklist
- TBD 
